package hifive;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="rooms", path="rooms")
public interface RoomRepository extends PagingAndSortingRepository<Room, Long>{

      Room findByRoomNumber(Long roomNumber);
      Room findByPayId(Long payId);
}
