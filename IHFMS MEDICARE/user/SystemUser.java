package user;

/**
 * User
 */
public abstract class SystemUser {

    // name
    private String name;

    // age
    private String role;

    // set role
    public void setRole(String role) {
        this.role = role;
    }

    // get role
    public String getRole() {
        return role;
    }


    // set name
    public void setName(String name) {
        this.name = name;
    }

    // get name
    public String getName() {
        return name;
    }

    // print my role
    public void printMyDetails() {
        System.out.println("Name: " + name);
        System.out.println("User: " + role + ".");
    }

}
