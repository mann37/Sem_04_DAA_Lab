

#include <iostream>
#include<bits/stdc++.h>

using namespace std;



void SelectionSort(vector<int>&arr){
    
    int i,j,minIndex=0;
    int n = arr.size();
    int countSwap=0;
    int countComp=0;
    
    for(i=0;i<n-1;i++){
        minIndex = i;
        
        for(j=i+1;j<n;j++){
            countComp++;
            
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
            
        }
        if(minIndex != i){
            
            swap(arr[minIndex],arr[i]);
            countSwap++;
            
        }
       
    }
    cout<<"Total no of comparisions are : "<<countComp<<"\n"<<"Total no of swaps : "<<countSwap<<endl;
    
    
}




int main()
{
    vector<int>v{40,30,50,10,20};
    SelectionSort(v);
    
    
    
    return 0;
}
