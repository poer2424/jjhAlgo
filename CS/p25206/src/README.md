# 너의 평점은

> 문제 번호 : 25206  
> 출처 : https://www.acmicpc.net/problem/25206

## 문제 설명

<p>인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!</p>
<p>치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.</p>
<p>전공평점은&nbsp;전공과목별 (학점&nbsp;× 과목평점)의 합을 학점의 총합으로 나눈 값이다.</p>
<p>인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와&nbsp;같다.</p>
<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 150px;">
 <tbody>
  <tr>
   <td style="text-align: center;">A+</td>
   <td style="text-align: center;">4.5</td>
  </tr>
  <tr>
   <td style="text-align: center;">A0</td>
   <td style="text-align: center;">4.0</td>
  </tr>
  <tr>
   <td style="text-align: center;">B+</td>
   <td style="text-align: center;">3.5</td>
  </tr>
  <tr>
   <td style="text-align: center;">B0</td>
   <td style="text-align: center;">3.0</td>
  </tr>
  <tr>
   <td style="text-align: center;">C+</td>
   <td style="text-align: center;">2.5</td>
  </tr>
  <tr>
   <td style="text-align: center;">C0</td>
   <td style="text-align: center;">2.0</td>
  </tr>
  <tr>
   <td style="text-align: center;">D+</td>
   <td style="text-align: center;">1.5</td>
  </tr>
  <tr>
   <td style="text-align: center;">D0</td>
   <td style="text-align: center;">1.0</td>
  </tr>
  <tr>
   <td style="text-align: center;">F</td>
   <td style="text-align: center;">0.0</td>
  </tr>
 </tbody>
</table>
<p>P/F 과목의 경우 등급이 <code>P</code>또는 <code>F</code>로 표시되는데, 등급이 <code>P</code>인 과목은 계산에서 제외해야 한다.</p>
<p>과연 치훈이는 무사히 졸업할 수 있을까?</p>

