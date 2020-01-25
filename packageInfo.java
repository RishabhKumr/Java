public class packageInfo
{
public static void main(String args[])
{
Package p =  Package.getPackage("java.lang");
System.out.println("Package Name:"+p.getName());
System.out.println("Specification Table"+p.getSpecificationVendor());
}
}

