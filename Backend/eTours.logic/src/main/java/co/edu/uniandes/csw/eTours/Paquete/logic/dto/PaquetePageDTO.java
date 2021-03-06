package co.edu.uniandes.csw.eTours.Paquete.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PaquetePageDTO {
    private Long totalRecords;

    private List<PaqueteDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<PaqueteDTO> getRecords() {
        return records;
    }

    public void setRecords(List<PaqueteDTO> records) {
        this.records = records;
    }
}
