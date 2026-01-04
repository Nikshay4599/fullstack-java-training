import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface DeveloperInfo {
    String name();
    String role();
}

@DeveloperInfo(name = "Your Name", role = "Java Developer")
public class Week15Program2 {
    public static void main(String[] args) {
        DeveloperInfo info =
                Week15Program2.class.getAnnotation(DeveloperInfo.class);

        System.out.println("Developer Name: " + info.name());
        System.out.println("Role: " + info.role());
    }
}
