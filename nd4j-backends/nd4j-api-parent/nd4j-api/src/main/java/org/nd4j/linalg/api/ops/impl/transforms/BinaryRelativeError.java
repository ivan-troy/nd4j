package org.nd4j.linalg.api.ops.impl.transforms;

import org.nd4j.autodiff.samediff.SDVariable;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;

import java.util.List;

/**
 * @author raver119@gmail.com
 */
public class BinaryRelativeError extends BaseTransformOp {
    private double threshold = 0.0;

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v1, SDVariable i_v2) {
        super(sameDiff, i_v1, i_v2);
    }

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v1, SDVariable i_v2, boolean inPlace) {
        super(sameDiff, i_v1, i_v2, inPlace);
    }

    public BinaryRelativeError(SameDiff sameDiff) {
        super(sameDiff);
    }

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v1, SDVariable i_v2, Object[] extraArgs) {
        super(sameDiff, i_v1, i_v2, extraArgs);
    }

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v, boolean inPlace) {
        super(sameDiff, i_v, inPlace);
    }

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v, int[] shape, boolean inPlace, Object[] extraArgs) {
        super(sameDiff, i_v, shape, inPlace, extraArgs);
    }

    public BinaryRelativeError(SameDiff sameDiff, SDVariable i_v, Object[] extraArgs) {
        super(sameDiff, i_v, extraArgs);
    }

    public BinaryRelativeError() {
    }

    public BinaryRelativeError(INDArray x, INDArray y, INDArray z, double threshold, long n) {
        super(x, y, z, n);
        this.threshold = threshold;
    }

    public BinaryRelativeError(INDArray x, INDArray y, double threshold) {
        super(x, y, x, x.lengthLong());
        this.threshold = threshold;
    }

    public BinaryRelativeError(INDArray x, INDArray y, INDArray z, double threshold) {
        super(x, y, z, x.lengthLong());
        this.threshold = threshold;
    }

    @Override
    public int opNum() {
        return 27;
    }

    @Override
    public String opName() {
        return "BinaryRelativeError";
    }

    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No  onnx opName found for " + opName());
    }

    @Override
    public String tensorflowName() {
        throw new NoOpNameFoundException("No  onnx opName found for " + opName());
    }

    @Override
    public void init(INDArray x, INDArray y, INDArray z, long n) {
        super.init(x, y, z, n);
        this.extraArgs = new Object[] {threshold};
    }


    @Override
    public List<SDVariable> doDiff(List<SDVariable> i_v1) {
        throw new UnsupportedOperationException();
    }
}
