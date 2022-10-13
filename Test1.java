/*1.what is platform independce?
    java is platform independce becouse write ones run anywere that mens you write java code in windows
	and run onther platform like [unix,mac] 
	Accutily byte code platform independce
	
 2.what are diff b/w primative and non primative datatype?
  datatype mens what type of data store in is called datatype..
example :int mens only intger value store ..
          String mens charter only store...///  
		  there are tow type of data 
		  1.primative  (fixed size)
		  2.nan primative(its not fixed size)
		* primative:
		    there are 8 type data
			datatype   defaultvalue  memory
			byte :           0         1 byte  8 bhit
			shor :           0         2 byte  16 bhit
			int:             0         4 byte  32 bhit
			long :           0l        8 byte  64 bhit
			foolt:           0.0f      4 byte  32 bhit
			double:          0.0       8 byte  64 bhit
			char:                      2 byte  16 bhit 
			bolian:         false              1 bhit
		* non primative:
		   there are 'n' number  inbuitkeyowds,first later is upper case Complsory
		    String
			Class.....etc
 3. Explian class and its member with example?
    * class is a bule print of object.
	* class is combination of states and bheviors.	
	Syntox:
	 public class Akash{
		 
	 }
	its member with example?
	1.contructor: contructor name nad class name should be same,, and  there is no retun type
	exampole: class A{
		a(){
			
		}
	}
	2.variables: It is register area allcated for memory (or) it is cantianer store the data
   eg: int a=10;	
	3.methads: methad is block of code for exuaction specfic task
	eg: static int main(){
		return;
		
	}
	
6. Explian main methad with the memory its execute?
    
	Public static void main(String args[]){
		public is access modifer.
		static is nan access modifer
		void mens there no retun type,
		main start exuaction with  a main methad,
		String args[]:command line arrgument
	}
	program exuaction  is jvm in java 
	there main 3 task
	1.load byte code ;
	2.verfiy byte code;
	3.exuaction byte code;
	finally dispaly output of the code
		 
 5.remove duplicate number in array*/
 public class Test1 {
	 
		public static void main(String[] args) {  
		        //Initialize array  
		        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		        System.out.println("Duplicate elements in given array: ");  
		        //Searches for duplicate element  
		        for(int i = 0; i < arr.length; i++) {  
		            for(int j = i + 1; j < arr.length; j++) {  
		                if(arr[i] == arr[j])  
		                    System.out.println(arr[j]);  
		            }  
		        }  
		    }  
		}  

		
			
		   
	