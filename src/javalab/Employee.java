package javalab;


     public abstract class Employee
    {
        String name;
        float salary;
        float gross_sal;

        Employee(String name, float salary)
        {
            this.name=name;
            this.salary=salary;
        }

        void print()
        {
            System.out.println("Employee name "+name);
            System.out.println("Employee salary "+salary);
            System.out.println("Employee gross salary "+gross_sal);
        }

        abstract void calculateGrossSalary();
        abstract void annualIncrement();
    }

    class Manager extends Employee
    {

        float hra;
        Manager(String name, float salary) {
            super(name, salary);
        }

        @Override
        void calculateGrossSalary() {
            gross_sal=(salary+hra)/12;
            super.print();
        }

        @Override
        void annualIncrement() {
            hra+=0.05*salary;
        }
    }
    class SalesManager extends Manager {
        private float commission;
        SalesManager(String name, float salary) {
            super(name, salary);
        }
        @Override
        void calculateGrossSalary() {
            gross_sal=(salary+hra+commission)/12;
            super.print();
        }
        @Override
        void annualIncrement() {
            hra+=0.05*salary;
            commission+=0.01*salary;
        }

    }

    class Myclass{
        public static void main(String[] args) {
            Manager manager=new Manager("urvashi",70000);
            manager.annualIncrement();
            manager.calculateGrossSalary();
            System.out.println();
            SalesManager salesManager=new SalesManager("ekta",50000);
            salesManager.annualIncrement();
            salesManager.calculateGrossSalary();

        }
    }

