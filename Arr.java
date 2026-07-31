public class Arr{
     public static void main(String[] args){
String[] cars = {"honda","bolero " , "fortuner"};
int[] nums = new int[6];
nums[1] = 77;
System.out.println(cars);
System.out.println(nums[1]);
int[] numbers  = {10,20,30,29,12};
for(int i =0;i < numbers.length;i++){
     System.out.println(numbers[i]);
     i++;
}
for(String car : cars){
     System.out.println(cars);
}
int[][] twodarr = {{1,2,3}, {4,5,6}};
System.out.println(twodarr[1][2]);

for(int row = 0; row < twodarr.length;row++){
     for(int col = 0; col < twodarr.length;row++){

System.out.println("myNumbers[" + row + "][" + col + "] = " + twodarr[row][col]);

     }
}

     }
    
}