#include<bits/stdc++.h>
using namespace std;

struct Knapsack{
    
    int weight;
    int value;
    Knapsack(int v ,int w){
        value = v;
        weight = w;
    }    
    
    
    
};
bool compare(struct Knapsack a , struct Knapsack b){
    
    double r1 = (double)a.value / a.weight;
    double r2 = (double)b.value / b.weight;
    return r1>r2;
    
}

double fractionalKnapsack(struct Knapsack arr[] , int N , int size){
    
    sort(arr , arr+size , compare);
    int currWeight = 0;
    double final_ans = 0.0;
    
    for(int i=0;i<size;i++){
        
        if(currWeight + arr[i].weight <= N){
            
            currWeight += arr[i].weight;
            final_ans += arr[i].value;
            
        }else{
            int remain = N - currWeight;
            
            final_ans += arr[i].value *((double)remain/arr[i].weight);
            break;
        }
    }
    return final_ans;
    
    
    
}



int main()
{
    int N=60;
    
    Knapsack arr[] = {
            {280,40},
            {100,10},
            {120,20},
            {120,24}
    };
    
    int size = sizeof(arr) / sizeof(arr[0]);
  

    cout << "Maximum profit = "<< fractionalKnapsack(arr, N, size);
    
    return 0;
}


