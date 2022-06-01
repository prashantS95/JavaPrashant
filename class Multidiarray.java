
class Multidiarray
{
 public static void main(String args[])
 {
     System.out.println("Matrix 1=");
   int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
   for (int i=0;i<3;i++)
   {
       for (int j=0;j<3;j++)
       {
           System.out.print(arr[i][j]+" ");
       }
   System.out.println();
    }

   System.out.println();
   System.out.println("Matrix 2=");

   int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
   for (int i=0;i<3;i++)
   {
       for (int j=0;j<3;j++)
       {
           System.out.print(arr1[i][j]+" ");
       }System.out.println();
    }
   
   
    System.out.println();
     System.out.println();
     System.out.println("Addition of matrix=");
    int arr3[][];
    arr3=new int[3][3];
    
    for (int i=0;i<3;i++)
   {
       for (int j=0;j<3;j++)
       {
           arr3[i][j]=arr[i][j]+arr1[i][j];
           System.out.print(arr3[i][j]+"  ");
       }System.out.println();
    }
   
   
    System.out.println();
    System.out.println();
    System.out.println("Subtraction of Matrix=");
    int arr4[][];
   arr4=new int[3][3];
   for (int i=0;i<3;i++)
  {
      for (int j=0;j<3;j++)
      {
          arr4[i][j]=arr[i][j]-arr1[i][j];
          System.out.print(arr4[i][j]+" ");
      }System.out.println();
   }

   System.out.println();
     System.out.println();

     System.out.println("Multiplication Matrix=");
    int arr5[][];
    arr5=new int[3][3];
    
    for (int i=0;i<3;i++)
   {
       for (int j=0;j<3;j++)
       {
           arr5[i][j]=arr[i][j]*arr1[i][j];
           System.out.print(arr5[i][j]+" ");
       }System.out.println();
    }
    System.out.println();
     System.out.println();

     System.out.println("Division of Matrix==");
    int arr6[][];
    arr6=new int[3][3];
    
    for (int i=0;i<3;i++)
   {
       for (int j=0;j<3;j++)
       {
           arr6[i][j]=arr[i][j]/arr1[i][j];
           System.out.print(arr6[i][j]+" ");
       }System.out.println();
    }
}


}