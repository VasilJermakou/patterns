package otherpatterns.unitofwork;

import java.util.*;

public class StudentRepository implements IUnitOfWork<StudentEntity>{

    /* class fields */
    private final Map<String, Set<StudentEntity>> context;
    private final Set<StudentEntity> studentDB;

    /* constructor */
    public StudentRepository(Map<String, Set<StudentEntity>> context, Set<StudentEntity> studentDB){
        this.context = context;
        this.studentDB = studentDB;
    }

    /* getters */
    public Map<String, Set<StudentEntity>> getContext() {
        return context;
    }

    public Set<StudentEntity> getStudentDB() {
        return studentDB;
    }

    /* overriding interface methods */
    @Override
    public void registerNew(StudentEntity entity) {
        MyLogger.LOGGER.info("RegisterNew() for insert in context. " + entity.getName());
        register(entity, IUnitOfWork.INSERT);
    }

    @Override
    public void registerModified(StudentEntity entity) {
        MyLogger.LOGGER.info("registerModified() for modify in context. " + entity.getName());
        register(entity, IUnitOfWork.MODIFY);
    }

    @Override
    public void registerDelete(StudentEntity entity) {
        MyLogger.LOGGER.info("registerDelete() for delete in context. " + entity.getName());
        register(entity, IUnitOfWork.DELETE);
    }

    private void register(StudentEntity studentEntity, String operation){
        Set<StudentEntity> studentsToOperate = context.get(operation);
        if(studentsToOperate == null){
            studentsToOperate = new HashSet<>();
        }
        studentsToOperate.add(studentEntity);
        context.put(operation, studentsToOperate);
    }

    @Override
    public void commit() {
        if(context == null || context.size() == 0){
            return;
        }

        MyLogger.LOGGER.info("Commit started ...");

        if(context.containsKey(IUnitOfWork.INSERT)){
            commitInsert();
        }

        if(context.containsKey(IUnitOfWork.MODIFY)){
            commitModify();
        }

        if(context.containsKey(IUnitOfWork.DELETE)){
            commitDelete();
        }

        MyLogger.LOGGER.info("Commit finished!");
    }

    private void commitInsert(){
        Set<StudentEntity> studentsToInsert = context.get(IUnitOfWork.INSERT);
        for(StudentEntity student : studentsToInsert){
            MyLogger.LOGGER.info("Saving to database " + student.getName());
            this.studentDB.add(student);
        }
    }

    private void commitModify(){
        Set<StudentEntity> studentsToModify = context.get(IUnitOfWork.MODIFY);
        for(StudentEntity student : studentsToModify){
            MyLogger.LOGGER.info("Modifying to database " + student.getName());
            this.studentDB.add(student);
        }
    }

    private void commitDelete(){
        Set<StudentEntity> studentsToDelete = context.get(IUnitOfWork.DELETE);
        for(StudentEntity student : studentsToDelete){
            MyLogger.LOGGER.info("Deleting to database " + student.getName());
            this.studentDB.add(student);
        }
    }
}
