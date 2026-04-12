package JavaStream;

import java.util.*;
import java.util.stream.*;

class NewEmployee {
    private int id;
    private String name;
    private String location;
    private String company;

    NewEmployee(int id, String name, String location, String company) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
    

    @Override
    public String toString() {
        return "{id-" + id +
               ", name-" + name +
               ", location-" + location +
               ", company-" + company+
               "}";
    }
}

public class StreamExampleEmployee {

    public static void main(String[] args) {

        List<List<NewEmployee>> employees = List.of(
            List.of(new NewEmployee(1, "Shayan", "Noida", "Indian Express")),
            List.of(new NewEmployee(1, "Divaynshu", "Noida", "HCL")),
            List.of(new NewEmployee(2, "Ankit", "Gurugram", "Accenture")),
            List.of(new NewEmployee(3, "Anand", "Gurugram", "Ex-AVL")),
            List.of(new NewEmployee(4, "Rahul", "Wfh", "Startup Noida"))
        );

        // flatten
        List<NewEmployee> emp = employees.stream()
                                      .flatMap(List :: stream)
                                      .collect(Collectors.toList());

        // list of locations
        List<String> locations = emp.stream()
                                    .map(NewEmployee::getLocation)
                                    .collect(Collectors.toList());
        System.out.println(locations);
        
        // lsit of company
        List<String> companies = emp.stream().map(NewEmployee::getCompany).collect(Collectors.toList());
        
        System.out.println(companies);
 
        // name -> location
        Map<String, String> nameLocation =
                emp.stream()
                   .collect(Collectors.toMap(
                		   NewEmployee::getName,
                		   NewEmployee::getLocation
                   ));
        System.out.println(nameLocation);

        // name -> company
        Map<String, String> nameCompany =
                emp.stream()
                   .collect(Collectors.toMap(
                		   NewEmployee::getName,
                		   NewEmployee::getCompany
                   ));
        System.out.println(nameCompany);
        
        
       // Group by employee on the basis of any properties.
       Map<String, List<NewEmployee>> groupByPro = emp.stream().collect(Collectors.groupingBy(str->str.getLocation()));
       System.out.println(groupByPro);
       
       groupByPro.forEach((x,y) ->{
    	   System.out.println("Location : " + x);
    	   y.forEach(z->System.out.println(z.getName()));
    	   
       });
    }
}
