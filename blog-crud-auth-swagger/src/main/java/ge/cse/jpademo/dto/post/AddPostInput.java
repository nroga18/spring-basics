package ge.cse.jpademo.dto.post;

import ge.cse.jpademo.dto.attachment.AttachmentDTO;
import ge.cse.jpademo.dto.category.CategoryDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AddPostInput {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;
    private List<CategoryDTO> categories;
    private AttachmentDTO attachmentDTO;
}
