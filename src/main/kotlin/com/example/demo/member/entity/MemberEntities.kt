package com.example.demo.member.entity

import com.example.demo.common.status.Gender
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(
        uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])]
)
class Member(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(length = 30, nullable = false, updatable = false)
        val loginId: String,

        @Column(nullable = false)
        val password: String,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        @Temporal(TemporalType.DATE)
        val birthDate: LocalDate,

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        val gender: Gender,

        @Column(nullable = false)
        val email: String,
){

}