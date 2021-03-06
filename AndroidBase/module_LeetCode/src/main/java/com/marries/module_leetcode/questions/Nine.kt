package com.marries.module_leetcode.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marries.module_leetcode.databinding.ItemPageBinding

class nine : Fragment() {

    private lateinit var mBinding: ItemPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = ItemPageBinding.inflate(inflater);
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.tittle.text = "9. 回文数 (简单)"
        mBinding.description.text = "判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。"
        mBinding.eg.text = "输入: -121\n" +
                "输出: false\n" +
                "解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。"
        mBinding.answer1.text = "fun isPalindrome(x: Int): Boolean {\n" +
                "    return when {\n" +
                "        x < 0 -> false\n" +
                "        x == 0 -> true\n" +
                "        x % 10 == 0 -> false\n" +
                "        else -> {\n" +
                "            var num = x\n" +
                "            var reNum = 0\n" +
                "            while (num != 0) {\n" +
                "                reNum = reNum * 10 + num % 10\n" +
                "                num /= 10\n" +
                "            }\n" +
                "            x == reNum\n" +
                "        }\n" +
                "    }\n" +
                "}"
    }
}

fun isPalindrome(x: Int): Boolean {
    return when {
        x < 0 -> false
        x == 0 -> true
        x % 10 == 0 -> false
        else -> {
            var num = x
            var reNum = 0
            while (num != 0) {
                reNum = reNum * 10 + num % 10
                num /= 10
            }
            x == reNum
        }
    }
}

fun main(args: Array<String>) {
    print(isPalindrome(5555))
}

