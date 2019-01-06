package com.hf.hfhs.UI;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.hf.hfhs.R;


public class WelcomeActivity extends AppCompatActivity {

    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
    }

    private void initView() {
        mImage = findViewById(R.id.Imageview);
        animator1();



    }

    /**
     * AnimatorSet实现组合动画
     * AnimatorSet可以指定动画同时或按顺序执行
     */
    private void animator1() {
        //X方向平移
//        ObjectAnimator translateXAnimaotr = ObjectAnimator.ofFloat(mImage, "translationX", 0f, 200f);
        //Y方向平移
//        ObjectAnimator translateYAnimaotr = ObjectAnimator.ofFloat(mImage, "translationY", 0f, 300f);

        //实现旋转动画，也可以单独使用rotationX或rotationY
        //rotationX 表示围绕 X 轴旋转
        //rotationY:表示围绕 Y 轴旋转
        //rotation:表示围绕 Z 旋转
        ObjectAnimator rotationAnimaotr = ObjectAnimator.ofFloat(mImage, "rotation", 0.5f, 720f);


        //缩放动画，也有X及Y两个方向上设置
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(mImage, "scaleX", 0f, 1f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(mImage, "scaleY", 0f, 1f);


        //透明度动画
//        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(mImage, "alpha", 0.5f, 1f);
        //然后通过AnimatorSet把几种动画组合起来
        AnimatorSet animatorSet = new AnimatorSet();
        /**
         * AnimatorSet正是通过以下方法来控制动画播放顺序：
         * after（Animator anim）：将现有动画插入到传入的动画之后执行。
         * before（Animator anim）：将现有动画插入到传入的动画之前执行。
         * with（Animator anim）：将现有动画和传入的动画同时执行。
         */
//        animatorSet.play(rotationAnimaotr).with(translateYAnimaotr).before(rotationAnimaotr).after(scaleXAnimator).with(scaleYAnimator).after(alphaAnimator);
        animatorSet.play(rotationAnimaotr).with(scaleXAnimator).with(scaleYAnimator);
        //设置动画时间
        animatorSet.setDuration(3000);
        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        //开始动画
        animatorSet.start();
    }


    /**
     * PropertyValuesHolder实现组合动画
     * PropertyValuesHolder类只能是多个动画一起执行
     */
    private void animatorStyleTwo() {
        //X方向平移
        PropertyValuesHolder translateXAnimaotr = PropertyValuesHolder.ofFloat("translationX", 0f, 200f);
        //Y方向平移
        PropertyValuesHolder translateYAnimaotr = PropertyValuesHolder.ofFloat("translationY", 0f, 300f);
        //实现旋转动画，也可以单独使用rotationX或rotationY
        //rotationX 表示围绕 X 轴旋转
        //rotationY:表示围绕 Y 轴旋转
        //rotation:表示围绕 Z 旋转
        PropertyValuesHolder rotationAnimaotr = PropertyValuesHolder.ofFloat("rotation", 0f, 360f, 0f);
        //缩放动画，也有X及Y两个方向上设置
        PropertyValuesHolder scaleXAnimator = PropertyValuesHolder.ofFloat("scaleX", 1f, 3f);
        PropertyValuesHolder scaleYAnimator = PropertyValuesHolder.ofFloat("scaleY", 1f, 3f);
        //透明度动画
        PropertyValuesHolder alphaAnimator = PropertyValuesHolder.ofFloat("alpha", 0.5f, 1f);
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(mImage, translateXAnimaotr, translateYAnimaotr, rotationAnimaotr, scaleXAnimator, scaleYAnimator);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

}
