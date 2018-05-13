
package pl.edu.ur.oopl9;

import java.util.Random;



public class Main {
public static void b_sort(int tab[]){
int temp;
int zmiana = 1;
while(zmiana > 0){
zmiana = 0;
for(int i=0; i<tab.length-1; i++){
if(tab[i]>tab[i+1]){
temp = tab[i+1];
tab[i+1] = tab[i];
tab[i] = temp;
zmiana++;
}
}
}
for(int i=0; i<tab.length; i++){
System.out.print(tab[i]+" ");
}
}
  
    public static void main(String[] args) {
          Random r = new Random(); // import java.util.Random; 
int[][] array = new int[10][10]; 
int c = 100; 

for (int a = 0; a < array.length; a++) 
{ 
for (int b = 0; b < array[a].length; b++) 
{ 
array[a][b] = r.nextInt(c); 
} 

c += 100; 
} 

for (int a = 0; a < array.length; a++) 
{ 

for (int b = 0; b < array[a].length; b++) 
{ 
System.out.print(array[a][b] + "\t"); 
} 
System.out.print("Po sortowaniu :");
b_sort(array[a]);

System.out.println(); 




} 

}
    }
    

