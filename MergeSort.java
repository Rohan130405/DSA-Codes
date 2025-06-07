import java.util.Arrays;

import javax.swing.JSpinner.ListEditor;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={ 2, 3, 5, 10, 15, 32, 23, 4, 9, 11, 6 };

        System.out.println("before sorting : "+Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));

    }

    public static void mergeSort(int[] inputarray) {
 
        int len=inputarray.length;
        if(len<2){
            return;
        }
        int midlength=len/2;
        int[] LeftHalf=new int[midlength];
        int[] RightHalf=new int[len-midlength];
        
        for(int i=0;i<midlength;i++){
            LeftHalf[i]=inputarray[i];
        }
        for(int i=midlength;i<len;i++){
            RightHalf[i-midlength]=inputarray[i];
        }

        mergeSort(LeftHalf);
        mergeSort(RightHalf);
        merge(inputarray, LeftHalf, RightHalf);
    }
    public static void merge(int[] inputarray,int[] LeftHalf,int[] RightHalf){
        int leftsize=LeftHalf.length;
        int rightsize=RightHalf.length;
        int i=0,j=0,k=0;
        while(i<leftsize && j<rightsize){
            if(LeftHalf[i]<=RightHalf[j]){
                inputarray[k]=LeftHalf[i];
                i++;
            }
            else{
                inputarray[k]=RightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftsize){
            inputarray[k]=LeftHalf[i];
            i++;
            k++;
        }
        while(j<rightsize){
            inputarray[k]=RightHalf[j];
            j++;
            k++;
        }
    }
}
