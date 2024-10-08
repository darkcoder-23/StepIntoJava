class Switch {
    public static void main(String[] args) {
        String day = "Sunday";
        switch(day) {
            case "Monday" -> System.out.println("6am");
            default -> System.out.println("9am");
        }

        //Another Method
        // String result = "";
        // result = switch(day) {
            

        //     case "Monday" :  yield "6am";
        //     default : yield "9am";

        // };


        // System.out.println(result);

    }
}