package numeric;

public class Fraction implements Comparable<Fraction> {
    public long a, b; 

    public Fraction(long a, long b) {
        if (b < 0) { 
            a = -a;
            b = -b;
        }
        long g = gcd(Math.abs(a), b);
        if (g != 0) {
            a /= g;
            b /= g;
        }
        this.a = a;
        this.b = b;
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Fraction plus(Fraction o) {
        return new Fraction(a * o.b + o.a * b, b * o.b);
    }

    public Fraction minus(Fraction o) {
        return new Fraction(a * o.b - o.a * b, b * o.b);
    }

    public Fraction mul(Fraction o) {
        return new Fraction(a * o.a, b * o.b);
    }

    public Fraction div(Fraction o) {
        return new Fraction(a * o.b, b * o.a);
    }

    @Override
    public int compareTo(Fraction o) {
    	return Long.compare(this.a/this.b, o.a/o.b);
    }
    
    public boolean lessThan(Fraction o) {
    	if (this.compareTo(o) < 0)
    		return true;
    	return false;
    }
    
    public boolean greaterThan(Fraction o) {
    	if (this.compareTo(o) > 0)
    		return true;
    	return false;
    }
    
    public boolean equals(Fraction o) {
    	if (this.compareTo(o) == 0)
    		return true;
    	return false;
    }
    
    public boolean notEqual(Fraction o) {
    	return !(this.equals(o));
    }
    
    public boolean lessThanOrEqual(Fraction o) {
    	if (this.compareTo(o) <= 0)
    		return true;
    	return false;
    }
    
    public boolean greaterThanOrEqual(Fraction o) {
    	if (this.compareTo(o) >= 0)
    		return true;
    	return false;
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }
    
    public Fraction mediant(Fraction f, Fraction g, long wf, long wg) {
    	return new Fraction(f.a*wf + g.a*wg, f.b*wf + g.b*wg);
    }
    
    public Fraction mediant(Fraction f, Fraction g) {
    	return new Fraction(f.a + g.a, f.b + g.b);
    }
    
    // find smallest fraction between two fractions using Stern-Brocot tree
    public Fraction findSmallestBetween(Fraction o) { 
    	Fraction l = new Fraction(0,1);
    	Fraction r = new Fraction(1,0);
    	while (true) {
    		Fraction m = mediant(l,r);
    		long bl = 0, br = 1;
    		if (m.lessThanOrEqual(this)) {
    			while (mediant(l,r,1,br).lessThanOrEqual(this))
    				br *= 2;
    			while (bl + 1 != br) {
    				long bm = (bl + br) / 2;
    				if (mediant(l,r,1,bm).lessThanOrEqual(this))
    					bl=bm;
    				else
    					br=bm;
    			}
    			l = mediant(l,r,1,bl);
    		} else if (m.greaterThanOrEqual(o)) {
    			while (mediant(l,r,br,1).greaterThanOrEqual(o))
    				br *= 2;
    			while (bl + 1 != br) {
    				long bm = (bl+br) / 2;
    				if (mediant(l,r,bm,1).greaterThanOrEqual(o))
    					bl = bm;
    				else
    					br=bm;
    			}
    			r = mediant(l,r,bl,1);
    		} else {
    			return m;
    		}	
    	}
    }
    

    // Usage example
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 5);
        System.out.println(a.plus(b));
        System.out.println(a.minus(b));
        System.out.println(a.mul(b));
        System.out.println(a.div(b));
    }
}
