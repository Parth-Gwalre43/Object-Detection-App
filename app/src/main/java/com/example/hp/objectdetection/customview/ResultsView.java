package com.example.hp.objectdetection.customview;

import java.util.List;
import com.example.hp.objectdetection.tflite.Classifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}