package com.example.demo.member.service

import com.example.demo.member.dto.MemberDtoRequest
import com.example.demo.member.entity.Member
import com.example.demo.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
        private val memberRepository: MemberRepository,
) {

    /**
    회원가입
     */
    fun signUp(memberDtoRequest: MemberDtoRequest): String {
        // ID 중복검사
        var member: Member? = memberRepository.findByLoginId(memberDtoRequest.loginId)
        if (member != null) {
            return "이미 등록된 회원입니다."
        }

        member = Member(
                id = null,
                name = memberDtoRequest.name,
                birthDate = memberDtoRequest.birthDate,
                email = memberDtoRequest.email,
                gender = memberDtoRequest.gender,
                password = memberDtoRequest.password,
                loginId = memberDtoRequest.loginId
        )

        memberRepository.save(member)

        return "회원가입이 완료되었습니다."
    }
}