def solution(n):
    work = str(n)
    answer = 0
    for i in range(len(work)):
        answer += int(work[i])

    return answer