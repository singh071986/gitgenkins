import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//sorted()/distinct()/map()/flatmap()/filter/boxed()/limit
//forEach()/collect(colelxcter.toset())/count()/toArray()/allmacthces()/anymatches()/findfrist()/findany()/min()/max()/reduce;

public class Java8 {

	public static void main(String[] args) { //flatmap
		
		  List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		   Optional<Integer> result=values.stream().map(e->e*2).reduce((c1,c2)->(c1>c2)?c1:c2);
		   System.out.println(result);
		   System.out.println();;
           List<List<Integer>> list2 = Arrays.asList(Arrays.asList(1,10), Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8,9,0));
		
		list2.parallelStream().distinct().flatMap(e->e.stream()).forEach(System.out::print);;
		System.out.println();;
		list2.stream().distinct().flatMap(e->e.stream()).map(e->e).sorted().forEach(System.out::print);;
		System.out.println();;
		
	
		
		String a="";
		int a1[]=new int[5];
		a.length();
		int cc=a1.length;
		
		List<Integer> list = Arrays.asList(1,10, 1,2, 3, 4, 5, 6, 7, 8, 9,0);
		list.stream().distinct().toArray();
		List<Integer> lst=list.parallelStream().sorted().filter(n->n%2==0).collect(Collectors.toList());
		
		Map<Integer,Integer> mapobj=new HashMap<Integer, Integer>();
		mapobj.put(1, 8);
		mapobj.put(2, 9);
		mapobj.put(4, 7);
		Set<Integer> int1=mapobj.entrySet().stream().filter(e->e.getKey()!=2).map(e->e.getValue()+1).collect(Collectors.toSet());
	    int1.stream().forEach(System.out::print);
		
		
		
		lst.parallelStream().sorted().filter(n->n/2!=0).map(n->n*2).forEach(System.out::println);
		
		lst.stream().sorted().filter(n->n!=0).forEach(System.out::println);
		
		Optional<Integer> ad=lst.stream().sorted().min((n1,n2)->n1-n2);
		
		lst.parallelStream().sequential().sorted((c1,c2)-> c1.compareTo(c2)).forEach(System.out::println);
		
		List<String> changeUpperCaseList=Arrays.asList("a","c","b","z");
		changeUpperCaseList.parallelStream().map(n->n.toUpperCase()).sorted().filter(n->n!=null).forEach(System.out::print);
		
		
		
		String x[]=new String[5];
		int x1[]=new int[5];
		float x2[]=new float[5];
		int x3[][]=new int[5][7];
		
		String x4[]= {"a","b","c"};
		int x5[]= {1,2,3,4};
		int x6[][]= {{1,2},{3,4,5}};
		
		Vector<String> v=new Vector<String>();
		v.add("ayuvan");
		v.add("c");
		v.add("b");
		v.add("b");
		v.stream().forEach(System.out::println);
		v.parallelStream().map(s->s.toUpperCase()).collect(Collectors.counting());
		v.parallelStream().map(s->s.toUpperCase()).forEach(System.out::println);
		v.parallelStream().map(s->s.toUpperCase()).filter(s->s!="a").distinct().sorted().forEach(System.out::print);
		System.out.println();
		v.parallelStream().map(s->s.toUpperCase()).filter(s->s!="a").distinct().forEach(System.out::print);
		System.out.println();
		Integer ab=null;
		int ac=1;
		System.out.println(Optional.ofNullable(ab).orElse(0)+Optional.ofNullable(ac).orElse(0));
		
		
		Map<String,String> map=new ConcurrentHashMap<String,String>();
		
	map.put("1", "Yuvaan");
	map.put("2", "Khushboo");
	map.put("3", "Yuvaan");
	map.put("4", "Abhay");
	
	//FInd first occurwance of Yuvaan in capital letter
	Optional<String> opt=map.entrySet().parallelStream().filter(e->e.getValue().equalsIgnoreCase("yuvaan")).map(e->e.getValue().toUpperCase()).sorted().findFirst();
	Function valueMapper = null;
	Function keyMapper = null;

	List<String> l=map.entrySet().parallelStream().map(e->e.getValue().toUpperCase()).sorted().collect(Collectors.toList());
	Set<String> s1=map.entrySet().parallelStream().filter(e->e.getValue().equalsIgnoreCase("yuvaan")).map(e->e.getValue().toUpperCase()).sorted().collect(Collectors.toSet());
	
	
	Runnable r1= ()->System.out.println("abhay");
	Thread t=new Thread(r1);
	t.start();
	

	//remove permgem space as used by native memory lcoation
	//anotation driven authntican emechanish-https://www.javacodegeeks.com/2018/04/java-ee-8-security-api-overview.html
	
	//@BasicAuthenticationMechanismDefinition
	//@FormAuthenticationMechanismDefinition
	//@CustomFormAuthenticationMechanismDefinition
	
	//identity store abstarction
	//common security context--  serveltcontainer and ejb conttiner two differnt securyty impelmetiaon now can use by common secutoyt a,chnis
		
	//completableFUture for joinign
	int A[]= {1, 3, 6, 4, 1, 2};
	System.out.println(solution(A));
	}
	
	   public static int solution(int[] A) {  
		  Arrays.sort(A);
	int b[]=new int[A.length];
	int j=0;
	for(int i=0;i<A.length-1;i++) {
		
		if(A[i]!=A[i+1]) {
			b[j++]=A[i];
		}
	}
	b[j++]=A[A.length-1];	  
	  int val=1;
	  boolean isValid=true;
	  
	  for(int i=0;i<b.length;i++) {
		  System.out.print(b[i]+",");
		  if(val!=b[i]) {
			  return val;
		  }else {
			  val=val+1;
		  }
		  
	  }
	  
	  return val;         
	        }
	   
	 
	

}
