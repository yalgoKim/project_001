<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>join</title>
</head>
<body>
<div class="wrap">
    <div id="container">
        <div id="contents">
            <div id="section1">
                <h1>Join</h1>
            </div>
            <div id="section2">
                <div id="s2_inner">
                    <div class="join">
                        <form name="joinform" action="/test" method="post" onsubmit="return test;">
                            <input type="hidden" name="hiddenId" value="0">
                            <table>
                                <colgroup>
                                    <col style="width: 150px">
                                    <col style="width: auto">
                                    <col style="width: auto">
                                </colgroup>
                                <tr>
                                    <th> 이름 </th>
                                    <td colspan="2">
                                        <input type="text" class="input" name="name" size="20" placeholder="이름을 입력하세요">
                                    </td>
                                    <th> 직급 </th>
                                    <th colspan="2">
                                        <input type="text" class="input" name="grade" size="20" placeholder="직급을 입력하세요">
                                    </th>
                                </tr>
                                <tr>
                                    <th> 핸드폰 </th>
                                    <td>
                                        <input type="text" class="input" name="phone_number" maxlength="11" style="width:100px">
                                    </td>
                                </tr>
                                <tr>
                                    <th> 이메일 </th>
                                    <td colspan="2">
                                        <input type="text" class="input" name="email1" maxlength="20" style="width:100px">
                                        @
                                        <input type="text" class="input" name="email2" maxlength="20" style="width:100px">
                                        <select class="input" name="email3" style="width:100px" onchange="selectEmailChk();">
                                            <option value="0">직접입력</option>
                                            <option value="naver.com">네이버</option>
                                            <option value="google.com">구글</option>
                                            <option value="daum.net">다음</option>
                                            <option value="nate.com">네이트</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="3" style="border-bottom:none;">
                                        <br>
                                        <div>
                                            <input type="submit" value="회원가입">
                                            <input type="reset" value="초기화">
                                            <input type="button" class="button" value="가입취소" onclick="window.location='index.jsp'">
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div> <!-- section2 -->
        </div> <!-- contents div -->
    </div> <!-- container div -->


</div>
</body>
</html>