import java.util.Scanner;

    class EmpCG
    {
        int Id;
        String Name;
        double Basic_Salary;
        double Provident_Fund;
        double House_Rent_Allowance;
        
        void GetData()           // Defining GetData()
        {

            
            Scanner sc = new Scanner(System.in);
            System.out.print("\n\tEnter Employee Id : ");
            Id = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();

            System.out.print("\n\tEnter Employee Basic Salary : ");
            Basic_Salary= Integer.parseInt(sc.nextLine());
            
        //    System.out.print("\n\tEnter Employee PF : ");
          //  Provident_Fund= Integer.parseInt(sc.nextLine());
            
          //  System.out.print("\n\tEnter Employee hra : ");
            //House_Rent_Allowance= Integer.parseInt(sc.nextLine());
            
            System.out.print("Record Entered Successfully");
        }
        void calSal(){
            
            Provident_Fund=Basic_Salary*0.10;
            House_Rent_Allowance=Basic_Salary*0.20;
            System.out.print("\n\t Total Salary of \t"+Name+"\t is \t" + (Basic_Salary+(Basic_Salary*1.10)+(Basic_Salary*1.20)));
            
        }
         int getId(){
             return this.Id;
         }
        void PutData()           // Defining PutData()
        {
            System.out.print("\n\t" + Id + "\t" +Name + "\t" +Basic_Salary+"\t"+Provident_Fund+"\t"+House_Rent_Allowance);
        }
        
        public static void main(String args[])
        {
Scanner sc1 = new Scanner(System.in);
            EmpCG[] Emp = new EmpCG[10];
            int i;
            int j=5;

            for(i=0;i<j;i++)
                Emp[i] =  new EmpCG();   // Allocating memory to each object

            for(i=0;i<j;i++)
            {
                System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
                Emp[i].GetData();
            }
         
         while(true){
         System.out.print("\nChoose one of the Options \n 1. Add new employee 2.Total salary of an employee "+
         "3.Display employee details 4.Display All Employee details 5.Exit\n");
       
         int opt = sc1.nextInt();
         if(opt==1){ j++;
         Emp[j-1] =  new EmpCG();
             Emp[j-1].GetData();
             
         }
         else if(opt==2){
             int flag=0;
             System.out.println("\nType the Id of the Employee");
             int empId = sc1.nextInt();
             for(i=0;i<j;i++){
                if (empId==Emp[i].getId()){
                    Emp[i].calSal();
                    flag++;
                }}
               if (flag==0) 
             System.out.println("\nNo such Employee");
         }
         else if(opt==3){
             int flag=0;
             System.out.println("\nType the Id of the Employee");
             int empId = sc1.nextInt();
             for(i=0;i<j;i++){
                if (empId==Emp[i].getId()){
                     System.out.print("\n\t Id \tName \tBasic salary\tProvisional fund\t House Rent Allowance\n");
                    Emp[i].PutData();
                    flag++;
                    break;
                      }
                   }
               if (flag==0) 
             System.out.println("\nNo such Employee");
               }
         
         else if(opt==4){
                    System.out.println("\nDetails of Employees\n");
                    System.out.print("\n\t Id \tName \tBasic salary\tProvisional fund\t House Rent Allowance\n");
                    for(i=0;i<j;i++)
                    Emp[i].PutData();
                  }
                  
             else if(opt==5)
             System.exit(0);
          }
       }
  }