package com.example.demo.member.dto

import com.example.demo.common.status.Gender
import org.apache.logging.log4j.util.StringMap
import java.time.LocalDate

data class MemberDtoRequest(
        val id: Long?,
        val loginId: String,
        val password: String,
        val name: String,
        val birthDate: LocalDate,
        val gender: Gender,
        val email: String,
)


/*
loginId
password
name
birthDate
gender
email
 */