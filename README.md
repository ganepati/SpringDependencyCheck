Dependency Check

To make setter dependency mandatory. By default dependency check value is none.
1) none
	If we apply dependency-check="none" then it's not mandatory to call setter methods. without calling setter methods this bean declaration is valid. You no need to pass any value.
 
2) simple :
	If we apply dependency-check="simple" then it's mandatory to pass Primitive setter dependency. 
3) object :
	If we apply dependency-check="object" then it's mandatory to pass secondary setter dependency.
4) All :
	If we apply dependency-check="All" then it's mandatory to pass primary as well as secondary setter dependency.

Note : If we go thought annotation, then we no need to add dependancy-check attribute in xml file.

Annotation Based.
	Before used this annotation we need to instantiate on class - RequiredAnnotationBeanPostProcessor
@Required -
If we used @Required annotation on the top of setter DI, Then it's mandatory to pass the value in XML file. 

Depends-on
	Apply Dependency for classes.
public class A{
	A(){
		System.out.println("A class Constructors...");
	}
}
public class B{
	B(){
		System.out.println("B class Constructors...");
	}
}
public class C{
	C(){
		System.out.println("C class Constructors...");
	}
}

Spring.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
	"http://www.springframework.org/dtd/spring-beans-2.0.dtd">

<beans>
	<bean id="a" class="beans.A" depends-on="b">
		<!-- class A is depends on class b, so before creating the object
		of class A create the object of class B. -->
	</bean>
	<bean id="b" class="beans.B" depends-on="c">
		<!-- class B is depends on class C, so before creating the object
		of class A create the object of class C. -->
	</bean>
	<bean id="c" class="beans.C">
	
	</bean>
</beans>

Before:
A class Constructors...
B class Constructors...
C class Constructors...
After :
C class Constructors...
B class Constructors...
A class Constructors...
