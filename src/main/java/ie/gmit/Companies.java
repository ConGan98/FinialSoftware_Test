package ie.gmit;

public class Companies {

    private String name;
    private int employee_count;
    private int departments;
    private int managers_count;
    private int project_count;

    public Companies(String name, int employee_count, int departments, int managers_count, int project_count) {
        if(name == " " || employee_count == 0 || departments == 0 || managers_count == 0 || project_count == 0){
            throw new IllegalArgumentException("Data is empty");
        }
        else {
            setName(name);
            setEmployee_count(employee_count);
            setDepartments(departments);
            setManagers_count(managers_count);
            setProject_count(project_count);

        }
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getEmployee_count() {
        return employee_count;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {


        if(employee_count >= departments){
            this.departments = departments;
        }
        else {
            throw new IllegalArgumentException("Invalid amount of managers for the departments");
        }

    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getManagers_count() {
        return managers_count;
    }

    public void setManagers_count(int managers_count) {


            this.managers_count = managers_count;

    }
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    public int getProject_count() {
        return project_count;
    }

    public void setProject_count(int project_count) {

        if(project_count<departments){
            throw new IllegalArgumentException("Invalid amount of projects, a department has no project");
        }
        else{
            this.project_count = project_count;
        }

    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

}