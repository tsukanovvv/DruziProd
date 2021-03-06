package tsukanov.druzi.repository.storage;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;

import tsukanov.druzi.entity.SkillCategory;

/**
 * 
 * @author tsukanov
 *
 */
@RepositoryDefinition(domainClass=SkillCategory.class, idClass=Long.class)
public interface SkillCategoryRepository {

	List<SkillCategory> findAll(Sort sort);
}
