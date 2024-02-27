import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)

@Documented // provide support for javadoc

@Target(value = {ElementType.LOCAL_VARIABLE, ElementType.METHOD})

@interface MyAnno {
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

//@MyAnno(name = "Ajay", project = "Bank", date = "29/12/2022", version = "13")
//@MyAnno(name = "Ajay", project = "Bank") // for use in interface
public class UserDefinedAnnotations {
    /*@MyAnno(name = "Ajay")
    int data;

    @MyAnno(name = "Ajay") 
    public static void main(@MyAnno(name = "Ajay") String[] args) {
        @MyAnno(name = "Ajay")
        int x;
    } */
    
    public static void main(String[] args) {
        @MyAnno(name = "Ajay", project = "Bank")

    }
}
