package service.hsf.entity;


import java.util.List;
import java.util.Map;

public interface ServiceUnitService2 {

    public List<ServiceUnitDTO> getServiceUnitByQuery(ServiceUnitQuery serviceUnitQuery);

    public ServiceUnitAssDTO2 getServiceUnitAssByBizId(Long bizId, int sourceId);

    public ServiceUnitAssDTO2 getServiceUnitAssById(Long id);

//	public ServiceUnitAss

    public DoServiceUtilResult2 doServiceUnitById(Long id, Map<String, Object> props, Long preTaskId);

    public DoServiceUtilResult2 doServiceUnitById(Long id, Map<String, String> props);

    public DoServiceUtilResult2 getTaskResult(Long taskId);

    public DoServiceUtilResult2 runLinkedListServiceUnit(List<Long> ids);
}