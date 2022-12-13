package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Message {
    /*
    {
    "email": "string",
    "id": 0,
    "message": "string",
    "name": "string",
    "subject": "string"
  }
     */
    private String email;
    private Integer id;
    private String message;
    private String subject;
    private String name;

    public Message() {
    }

    public Message(String email, Integer id, String message, String subject, String name) {
        this.email = email;
        this.id = id;
        this.message = message;
        this.subject = subject;
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
