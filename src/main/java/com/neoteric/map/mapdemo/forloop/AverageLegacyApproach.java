package com.neoteric.map.mapdemo.forloop;

import java.util.*;

public class AverageLegacyApproach {
    public static void main(String[] args) {

            List<Employe> itEmploye = new ArrayList<>();
            Employe first = new Employe();
            first.setEmpid("1");
            first.setSalary(1000);
            first.setDept("IT");
            Employe second = new Employe();
            second.setEmpid("2");
            second.setSalary(100);
            second.setDept("IT");
            Employe third = new Employe();
            third.setEmpid("3");
            third.setSalary(10);
            third.setDept("IT");
            itEmploye.add(first);
            itEmploye.add(second);
            itEmploye.add(third);
            Employe cseFirst = new Employe();
            cseFirst.setEmpid("4");
            cseFirst.setSalary(2000);
            cseFirst.setDept("Cse");
            Employe cseSecond = new Employe();
            cseSecond.setEmpid("5");
            cseSecond.setSalary(200);
            cseSecond.setDept("Cse");
            Employe cseThird = new Employe();
            cseThird.setEmpid("6");
            cseThird.setSalary(20);
            cseThird.setDept("Cse");
            itEmploye.add(cseFirst);
            itEmploye.add(cseSecond);
            itEmploye.add(cseThird);

            Map<String,Double> deptAvgSalaryMap = new HashMap<>();
            Map<String,Integer> deptEmpCountMap = new HashMap<>();
            Map<String, Double> deptMaxSalaryMap = new HashMap<>();
            Map<String, Double> deptMinSalaryMap = new HashMap<>();


            Iterator<Employe> employeIterator = itEmploye.iterator();

            while (employeIterator.hasNext()){
                Employe emp = employeIterator.next();
                String dept = emp.getDept();
                double salary = emp.getSalary();
                String highestAvgDept = null, lowestAvgDept = null;
                String highestMaxDept = null, lowestMinDept = null;
                double highestAvg = Double.MIN_VALUE, lowestAvg = Double.MAX_VALUE;
                double highestMax = Double.MIN_VALUE, lowestMin = Double.MAX_VALUE;


                if (deptAvgSalaryMap.containsKey(emp.getDept())){
                    Double d =deptAvgSalaryMap.get(emp.getDept());
                    Double total = d+emp.getSalary();
                    deptAvgSalaryMap.put(emp.getDept(),total);
                    int count = deptEmpCountMap.get(emp.getDept());
                    int totalcount = count+1;
                    deptEmpCountMap.put(emp.getDept(),totalcount);

                }else {
                    deptAvgSalaryMap.put(emp.getDept(),emp.getSalary());
                    deptEmpCountMap.put(emp.getDept(),1);

                }
                deptAvgSalaryMap.put(dept, deptAvgSalaryMap.getOrDefault(dept, 0.0) + salary);
                deptEmpCountMap.put(dept, deptEmpCountMap.getOrDefault(dept, 0) + 1);
                deptMaxSalaryMap.put(dept, Math.max(deptMaxSalaryMap.getOrDefault(dept, Double.MIN_VALUE), salary));
                deptMinSalaryMap.put(dept, Math.min(deptMinSalaryMap.getOrDefault(dept, Double.MAX_VALUE), salary));


            }
            System.out.println("total salary"+deptAvgSalaryMap);
            System.out.println("total count"+deptEmpCountMap);

            Iterator<String> deptIterator = deptAvgSalaryMap.keySet().iterator();
            while (deptIterator.hasNext()){
                String dept = deptIterator.next();
                Double totalSalary = deptAvgSalaryMap.get(dept);
                int totalcount = deptEmpCountMap.get(dept);
                double maxSalary = deptMaxSalaryMap.get(dept);
                double minSalary = deptMinSalaryMap.get(dept);
                System.out.println("Avg salary by dept"+totalSalary/totalcount);
                System.out.println("Maximum Salary: " + maxSalary);
                System.out.println("Minimum Salary: " + minSalary);

     }


        }
}
