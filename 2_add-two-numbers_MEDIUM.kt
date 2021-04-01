// 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
// 请你将两个数相加，并以相同形式返回一个表示和的链表。
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/add-two-numbers
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ll1 = l1
        var ll2 = l2
        var andOne: Int = 0
        var result: ListNode? = null
        while((ll1 != null || ll2 != null) || andOne == 1) {
            var tempValue: Int = (ll1?.`val` ?: 0) + (ll2?.`val` ?: 0) + andOne
            if(tempValue > 9) {
                andOne = 1
                tempValue = tempValue - 10
            } else {
                andOne = 0
            }
            ll1 = ll1?.next
            ll2 = ll2?.next
            if(result != null) {
                var end: ListNode = result
                while(end.next != null) {
                    end = end.next
                }
                end.next = ListNode(tempValue)
            } else {
                result = ListNode(tempValue)
            }
        }
        return result
    }
}