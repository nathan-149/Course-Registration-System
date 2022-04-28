import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public interface StudentInterface {
	public void studentViewAllCourses();
	public void viewAvailableCourses();
	public void registerToCourse() throws IOException;
	public void withdrawFromCourse() throws IOException;
	public void viewAllRegisteredCourses();
}
