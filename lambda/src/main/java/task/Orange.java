package task;


import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
@Builder
@Data

public class Orange {
    private int weight;
    private Color color;





}


//@Builder generates an @AllArgsConstructer unless there is another @XConstructor
