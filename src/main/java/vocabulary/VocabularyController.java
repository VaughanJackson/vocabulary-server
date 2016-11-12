package vocabulary;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VocabularyController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/vocabulary", method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(value= "/reload", method=RequestMethod.PUT)
    public @ResponseBody Response reload() {
        // Eclipse/STS falsely reports Lombok constructor cannot be found.
        // Possibly https://issuetracker.springsource.com/browse/STS-4133.
        return new Response(true);
    }

}
