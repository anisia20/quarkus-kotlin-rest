package org.samuel.code

enum class ResultCode(r: String, tp: String, rd: String, cd: String) {
    /** 내부 코드 체계  */
    R_000("000", "COMMON", "성공", "성공"),
    R_201("201", "CONFIG", "GNB 데이터 서버 오류.", "GNB 데이터 서버 오류."),
    R_202(
        "202",
        "CONFIG",
        "OID 데이터 서버 오류.",
        "OID 데이터 서버 오류."
    ),
    R_203("203", "CONFIG", "데이터 형식 오류", "데이터 형식 오류"),
    R_211("211", "CONTENTS", "id 오류", "id 오류"), R_212(
        "212",
        "CONTENTS",
        "추천 기본 데이터 오류",
        "추천 기본 데이터 오류"
    ),
    R_213("213", "CONTENTS", "데이터 없음", "데이터 없음"),
    R_214(
        "214",
        "CONTENTS",
        "데이터 호출 횟수 제한",
        "과데이터 호출 횟수 제한"
    ),
    R_221("221", "HOTISSUE", "데이터 없음", "데이터 없음"),
    R_280("280", "SYS", "데이터베이스 오류", "데이터베이스 오류"),
    R_ETC(
        "999",
        "ETC",
        "기타",
        "기타오류"
    );

    var r: String? = null
    var tp: String? = null
    var rd: String? = null
    var cd: String? = null
}