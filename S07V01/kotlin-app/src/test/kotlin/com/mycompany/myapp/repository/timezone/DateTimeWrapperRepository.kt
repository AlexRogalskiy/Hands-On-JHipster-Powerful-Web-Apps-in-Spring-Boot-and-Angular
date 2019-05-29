package com.mycompany.myapp.repository.timezone

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Spring Data JPA repository for the [DateTimeWrapper] entity.
 */
@Repository
interface DateTimeWrapperRepository : JpaRepository<DateTimeWrapper, Long>
