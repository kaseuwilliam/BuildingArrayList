import java.util.HashMap;
public class Q6 {
 
	public static int func(int a[])
	{
    	int i;
 
    	HashMap<Integer, Integer> te = new HashMap<>();
    	HashMap<Integer, Integer> to = new HashMap<>();
 
    	for (i = 0; i < a.length; i++) {
 
        	if (i % 2 == 0) {
 
            	if (te.containsKey(a[i])) {
                	te.put(a[i], te.get(a[i]) + 1);
            	} else {
                	te.put(a[i], 1);
                	System.out.println(a[i]);
            	}
        	}
        	else {
 
            	if (to.containsKey(a[i])) {
                	to.put(a[i], to.get(a[i]) + 1);
                	System.out.println(a[i]);
            	}
            	else {
                	to.put(a[i], 1);
            	}
        	}
    	}
 
    	int me = -1;
    	int mo = -1;
    	int ce = -1;
    	int co = -1;
 
    	for (Integer It : te.keySet()) {
        	if (te.get(It) > ce) {
            	ce = te.get(It);
            	me = It;
        	}
    	}
 
    	for (Integer It : to.keySet()) {
        	if (to.get(It) > co) {
            	co = to.get(It);
            	mo = It;
        	}
    	}

    	System.out.println(me);
    	System.out.println(mo);
    	System.out.println(ce);
    	System.out.println(co);
 
    	int k = 0;
 
    	for (i = 0; i < a.length; i++) {
        	if (i % 2 == 0) {
            	if (a[i] != me) {
                	k++;
            	}
        	}
        	else {
            	if (a[i] != mo) {
                	k++;
            	}
        	}
    	}
 
    	return k;
	}
 
	public static void main(String[] args)
	{
    	int a[] = { 122, 121, 120, 130, 140, 121, 122 };
    	System.out.println(func(a));
	}
}
