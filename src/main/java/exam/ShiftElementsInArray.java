package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    
      int j,last;
      last=arr[arr.length-1];
      for(j=arr.lenght-1;j>0;j--)
      {
        arr[j]=arr[j-1];      }
    }
    arr[0]=last;
    for(int i=0;i<arr.length;i++)
    {
    System.out.println(arr[i]+" ");
    }
  
public static void main(String[] args){
  
  int []arr=new int [](1,2,3,4,5);
  shift(arr);
}
}
