public class IfElseExamples {
    public static void main(String[] args) {

 //simple if
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
    }
}
       
//If-else
        int salary = 25500;
       if(salary>10000){
            salary=salary+2000;
        }else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }
}

//Multiple if else

        if (salary > 20000) {
            salary = salary + 3000;
        } else if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
