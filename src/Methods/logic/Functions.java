package Methods.logic;

import java.util.ArrayList;

public class Functions{
	
	public int min(int a[]) {
		int min=0;
		min = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				}
			}
		return min;
	}
	
	public int max(int a[]) {
		int max=0;
		max =a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				}
			}
		return max;
	}
	
    public int find(int a[],int f) {
	    int t=-1;
	    for(int i =0; i<a.length; i++) {
	    	if(a[i]==f) {
	    		 t = i+1;
	    	}
	    }
	    return t;
    }
    
    public ArrayList<Integer> primeNum(int a[],int n) {
    	ArrayList<Integer> ar= new ArrayList<Integer>();
    	//int prime =0;
    	int count =0;
    	for(int i=0; i<n; i++) {
			for(int j=2; j<a[i]; j++) {
				if(a[i]%j==0) {
					count++;
					//break;
				}
				
			}
			if(count==0) {
				ar.add(a[i]);
				//break;
			}
			count = 0;
    	
    	}
    	return ar;
    }
    
    public boolean primeNum(int n) {
    	//int prime =0;
    	int count =0;
    	for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					count++;
					break;
				}
				
			}
			if(count==0 && n!=1) 
				return true;
			
			else
				return false;
				
		//count = 0;
    }
}

