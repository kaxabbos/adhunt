package com.adhunter.repo;

import com.adhunter.model.Ads;
import com.adhunter.model.enums.adStatus;
import com.adhunter.model.enums.Category;
import com.adhunter.model.enums.Region;
import com.adhunter.model.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdsRepo extends JpaRepository<Ads, Long> {
    List<Ads> findAllByStatus(adStatus status);

    List<Ads> findAllByNameContainingAndStatusAndDescription_CategoryAndDescription_RegionAndDescription_Type(String name, adStatus status, Category category, Region region, Type type);

    List<Ads> findAllByStatusAndDescription_Category(adStatus status, Category category);

    List<Ads> findAllByStatusAndDescription_Type(adStatus status, Type type);
    List<Ads> findAllByStatusAndDescription_Region(adStatus status, Region region);
}
