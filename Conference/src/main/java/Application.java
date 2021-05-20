import com.sample.service.SpeakerService;
import com.sample.service.QuizServiceImpl;

public class Application {

    public static void main(String args[])
    {
        SpeakerService service =new QuizServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
