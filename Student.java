class Student
{
int id;
String name;
int age;
Student(int i, String n)
{
id=i;
name=n;
System.out.println("id and name:   " + i +"\t" + n);
}
Student(int i, String n,int a)
{
id=i;
name=n;
age=a;
System.out.println("id,name,age:  " + i +"\t"+ n+"\t"+ a);
}

public static void main(String args[])
{
Student s1=new Student(1001,"xyz");
Student s2=new Student(1002,"abc",20);
}
}

