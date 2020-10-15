# { SIMPLE SUMMARY }

1.	머신러닝은 Cost가 가장 낮을 때의 Weight를 찾아가는 과정이다. Weight는 모델의 복잡도이다.
2.	SGD, Adam, RMSprop등등 최적화의 가장 기초단계는 1번과 같으며, Hypothesis가 복잡할수록 Cost 함수가 복잡해져 Local Minimum 문제의 우려가 커진다.
3.	예측을 잘 한다는 것은 Trainset에 대한 타겟이 무엇인지를 잘 맞추겠다는 의미
4.	Cost의 Gradient는 Weight가 증가할 때 Cost가 어떻게 변화하는지 설명하는 수치.
   - cost가 가장 낮을 때의 Weight를 찾기 위해선, Weight에 대한 Cost의 Gradient를      
     계산해야 함.
5.	Gradient Descent에서 Gradient가 양수면 Weight는 감소할 때 Cost가 낮아진다.
   음수면 Cost가 낮아지는 방향으로 Weight를 업데이트하면 Weight는 커진다.
   - 일반적으로 Gradient 크기보다 Weight 크기가 작다.
6.	지도학습의 Hypothesis는 X와 y의 관계식이다.
7.	규제는 모델의 복잡도를 제한 혹은 일반화 시키는 것이다.
8.	R2 Score는 모델이 데이터의 분산도를 얼마나 잘 설명하는지에 대한 수치.(고고익선)
9.	정밀도와 재현율의 관한 간단한 설명
   - 정밀도 : Positive라 예측하기를 조심스러워 함. 
   - 재현율 : Positive라 예측하기를 과감하게 진행.
10.	K-Means는 평가르기와 중심재설정의 반복.
11.	PCA는 데이터가 가장 많이 흩어져 보이는지 찾고, 모으거나 제외시키겠다는 의미
12.	데이터가 ‘매우 sparse 하다’ 는 의미는, feature수가 데이터셋에 비해 많은 반면 데이터의 복잡도가 단순하다는 의미이다.
   - 규제화와 PCA로 일부 해결 가능.
13.	딥러닝은 기본적으로 레이어가 깊고 깊고 깊을수록 성능이 올라간다. 
   - Dropout, Batch Normalization 등 과적합의 문제를 해결하는 방법들이 
     상당히 동원되는 중.
   - 일반적으로 Underfitting의 상황에선 Layer수를 높혀주고, Overfitting의 상황에선 
     Layer의 Node수를 높혀준다.
14.	딥러닝은 비선형의 문제를 선형 문제로 바꿈 -> 선형모델인 단층 퍼셉트론으로 푼다
15.	딥러닝의 Weight가 업데이트 되는 횟수는 Epoch * Total Batch 수로 계산 가능.
16.	CNN은 데이터의 공간 정보를 활용
17.	RNN은 데이터의 시간 정보를 활용
18.	GAN은 Discriminator와 Generator 모두 학습시킨다. 
   - D가 G가 만든 데이터에 대해 예측을 잘하면 D의 Cost는 낮고 G의 Cost는 높다.
   - D가 원본 데이터에 대해 예측을 잘하면 D와 G의 Cost는 낮다.



## [ Deep Learning ]

-	Multi Layer Perceptron (Feedforward Neural Network)
-	Convolutional Neural Network
-	Recurrent Neural Network
-	Auto Encoder
-	Generative Adversarial Network

## [ Supervised Learning ]

-	Linear Regression
-	Ridge Regression
-	Lasso Regression
-	ElasticNet
-	Logistic Regression
-	Linear SVM
-	Kernel-SVM
-	Perceptron
-	Multi Layer Perceptron (Feedforward Neural Network)
-	Decision Tree
-	Random Forest (Bagging)
-	AdaBoost (Boosting)
-	Gradient Boosting Algorithm
-	XGBoost 종류
-	Convolutional Neural Network
-	Recurrent Neural Network


## [ Unsupervised Learning ]

-	K-Means
-	Hierarchical-Clustering
-	Principal Component Analysis
-	Auto Encoder
-	Generative Adversarial Network

## [ Regression ]

-	Linear Regression
-	Ridge Regression
-	Lasso Regression
-	ElasticNet
-	Perceptron
-	Multi Layer Perceptron (Feedforward Neural Network)
-	Decision Tree
-	Random Forest (Bagging)
-	AdaBoost (Boosting)
-	Gradient Boosting Algorithm
-	XGBoost 종류
-	Convolutional Neural Network
-	Recurrent Neural Network

## [ Classification ]

-	Logistic Regression
-	Linear SVM
-	Kernel-SVM
-	Perceptron
-	Multi Layer Perceptron (Feedforward Neural Network)
-	Decision Tree
-	Random Forest (Bagging)
-	AdaBoost (Boosting)
-	Gradient Boosting Algorithm
-	XGBoost 종류
-	Convolutional Neural Network
-	Recurrent Neural Network

## [ Clustering ]

-	K-Means
-	Hierarchical-Clustering

## [ Transformation ]

-	Principal Component Analysis
-	Auto Encoder
-	Generative Adversarial Network

## [ Non-linear Function ]

-	Kernel-SVM
-	Multi Layer Perceptron (Feedforward Neural Network)
-	Decision Tree
-	Random Forest (Bagging)
-	AdaBoost (Boosting)
-	Gradient Boosting Algorithm
-	XGBoost 종류
-	Convolutional Neural Network
-	Recurrent Neural Network
-	Auto Encoder  (군집화 이므로 선형/비선형이 무의미)
-	Generative Adversarial Network (군집화 이므로 선형/비선형이 무의미)


