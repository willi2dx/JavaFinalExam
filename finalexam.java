//GOrdon Elliott Williams
//CIS290 Mobile Application Development
//Unit One

import java.util.*;

class unitOne {
public static void main (String[] arg){


Scanner scan = new Scanner(System.in);

double hourlySalary;
double hoursWorked;
double OTRate;
double grossPay;
double OTWorked;
int aa, bb, cc, dd, ee, ff, gg, hh, ii, jj;

System.out.print("Enter ten integers?   ");
aa = scan.nextInt();
bb = scan.nextInt();
cc = scan.nextInt();
dd = scan.nextInt();
ee = scan.nextInt();
ff = scan.nextInt();
gg = scan.nextInt();
hh = scan.nextInt();
ii = scan.nextInt();
jj = scan.nextInt();

System.out.println("There ten numbers entered are " + aa + " " + bb + " " + cc + " "+ dd  + " " +  ee  + " " +  ff  + " " +gg  + " " +  hh  + " " +  " " +  ii  + " " +  jj);
System.out.println();

if (aa % 2 == 0){
   System.out.println(aa + " is a positive number");}
if (bb % 2 == 0){
   System.out.println(bb + " is a positive number");}
if (cc % 2 == 0){
   System.out.println(cc + " is a positive number");}
if (dd % 2 == 0){
   System.out.println(dd + " is a positive number");}
if (ee % 2 == 0){
   System.out.println(ee + " is a positive number");}
if (ff % 2 == 0){
   System.out.println(ff + " is a positive number");}
if (gg % 2 == 0){
   System.out.println(gg + " is a positive number");}
if (hh % 2 == 0){
   System.out.println(hh + " is a positive number");}
if (ii % 2 == 0){
   System.out.println(ii + " is a positive number");}
if (jj % 2 == 0){
   System.out.println(jj + " is a positive number");}
   
System.out.println();
System.out.println();

int [] myArray = {aa, bb, cc, dd, ee, ff, gg, hh, ii, jj};

Arrays.sort(myArray);

System.out.println("I have now put all ten numbers entered into an array and had them sorted numerically (below):  ");
System.out.println(Arrays.toString(myArray));

System.out.print("What is your hourly rate of pay?   ");
hourlySalary = scan.nextDouble();

System.out.print("How many hours did you work (up to 35)?   ");
hoursWorked = scan.nextDouble();

if (hoursWorked <= 35)
{System.out.print("Your total regular hours worked is:  " + hoursWorked + " at a rate of $" + hourlySalary + " totaling a gross pay of $" + (hoursWorked * hourlySalary) + ".");}

else
{OTRate = (hoursWorked - 35) * (hourlySalary + (hourlySalary * .50));
System.out.print("Your total regular hours worked is-  " + hoursWorked + " at a rate of $" + hourlySalary + " totaling a gross pay of $" + (hoursWorked * hourlySalary) + ".");
//System.out.print("Your total OT hours worked is-       " + OTWorked    + " at a rate of $" + OTRate + " totaling a gross pay of $" + (OTWorked * OTRate) + ".");
}
}
}

