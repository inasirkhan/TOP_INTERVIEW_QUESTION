package top150.streams;

import java.util.List;
import java.util.Optional;

public class OrElse {

    static class Dev{
        Integer id;
        String name;
        String designation;
        Integer salary;

        public Dev(Integer id, String name, String designation, Integer salary) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Dev{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
    public static void main(String[] args) {
        Dev dev = new Dev(101, "Nasser", "Java Developer", 21000);
        Dev dev1 = new Dev(101, "Kane Adams", "FrontEnd Developer", 61000);
        Dev dev2 = new Dev(101, "Aarush Kushwah", "Java Developer", 55000);
        Dev dev3 = new Dev(101, "Monit Malve", "Java Developer", 32000);
        Dev dev4 = new Dev(101, "Ronit Sharam", "Java Developer", 41000);

        List<Dev> devList = List.of(dev, dev1, dev2, dev3, dev4);
//        Dev devWithPython = devList.stream().filter(
//                        emp -> emp.designation.equalsIgnoreCase("PYTHON DEVELOPER")
//                )
//                .findFirst()
//                .get();
//         WILL THROW EXCEPTION IF NOT FOUND

        Dev pythonDeveloper = devList.stream().filter(
                        emp -> emp.designation.equalsIgnoreCase("PYTHON DEVELOPER")
                )
                .findFirst()
                .orElse(null);
        System.out.println(pythonDeveloper);

        pythonDeveloper = devList.stream().filter(
                        emp -> emp.designation.equalsIgnoreCase("PYTHON DEVELOPER")
                )
                .findFirst()
                .orElseThrow(()->new RuntimeException("No python dev found!"));
    }
}

